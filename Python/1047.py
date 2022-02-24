(h_inicio, m_inicio, h_fin, m_fin) = map(int, input().split(" "))
t_minutos_inicio = h_inicio * 60 + m_inicio
t_minutos_fin = h_fin * 60 + m_fin

t = t_minutos_fin - t_minutos_inicio if t_minutos_fin > t_minutos_inicio else 1440 - \
    t_minutos_inicio + t_minutos_fin
h = t // 60
m = t % 60

print("O JOGO DUROU %d HORA(S) E %d MINUTO(S)" % (h, m))
