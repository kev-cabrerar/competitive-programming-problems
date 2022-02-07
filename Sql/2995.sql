SELECT temperature,
    COUNT(mark) number_of_records
FROM records
GROUP by temperature,
    mark
ORDER by mark