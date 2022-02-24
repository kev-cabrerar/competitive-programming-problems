var input = `7 8 9 10`;
let [h_inicio, m_inicio, h_fin, m_fin] = input
  .split(/[\s]/)
  .map((x) => Number(x));
let t_minutos_inicio = 60 * h_inicio + m_inicio;
let t_minutos_fin = 60 * h_fin + m_fin;
let t =
  t_minutos_fin > t_minutos_inicio
    ? t_minutos_fin - t_minutos_inicio
    : 1440 - t_minutos_inicio + t_minutos_fin;
let h = Math.floor(t / 60);
let m = t % 60;

console.log("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
