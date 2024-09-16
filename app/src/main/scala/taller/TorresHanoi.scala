package taller

class TorresHanoi {
  def movsTorresHanoi(n: Int): BigInt = {
    if (n <= 0)
      0
    else
      2 * movsTorresHanoi(n - 1) + 1
  }
  def torresHanoi(n: Int, t1: Int, t2: Int, t3: Int): List[(Int, Int)] = {
    if (n == 0)
      List() // Caso base: mover un disco directamente de t1 a t3
    else {
      // Paso 1: Mover n-1 discos de t1 a t2 usando t3 como intermediaria
      val paso1 = torresHanoi(n - 1, t1, t3, t2)

      // Paso 2: Mover el disco más grande de t1 a t3
      val paso2 = List((t1, t3))

      // Paso 3: Mover los n-1 discos de t2 a t3 usando t1 como intermediaria
      val paso3 = torresHanoi(n - 1, t2, t1, t3)

      // Unir los tres pasos en una lista de movimientos
      paso1 ++ paso2 ++ paso3
    }
  }
}