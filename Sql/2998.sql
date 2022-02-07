SELECT operations_results1.name,
    operations_results1.investment,
    min(operations_results1.month) "month_of_payback	",
    min(operations_results1.return) "return"
FROM (
        SELECT clients.id,
            clients.name,
            clients.investment,
            operations_results.sum,
            operations_results.month,
            operations_results.sum - clients.investment "return"
        from clients
            JOIN (
                SELECT op1.client_id,
                    op1.month,
                    (
                        SELECT sum(op2.profit)
                        from operations op2
                        WHERE op2.month <= op1.month
                            and op2.client_id = op1.client_id
                    )
                from operations op1
                GROUP by op1.client_id,
                    op1.month
            ) operations_results on operations_results.client_id = clients.id
            and operations_results.sum >= clients.investment
    ) operations_results1
GROUP by operations_results1.name,
    operations_results1.investment