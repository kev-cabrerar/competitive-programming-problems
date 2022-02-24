(inicio, fin) = map(int, input().split(" "))
if(inicio == fin):
    print("O JOGO DUROU 24 HORA(S)")
elif(inicio > fin):
    print("O JOGO DUROU %d HORA(S)" % (24-inicio+fin))
elif(inicio < fin):
    print("O JOGO DUROU %d HORA(S)" % (fin-inicio))
