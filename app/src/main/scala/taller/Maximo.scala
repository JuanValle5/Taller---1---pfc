package taller

import scala.annotation.tailrec

class Maximo {
  def maxLin(l: List[Int]): Int = {
    if (l.isEmpty) throw new IllegalArgumentException("La lista no puede estar vacia")
    else if (l.tail.isEmpty) l.head
    else max(l.head, maxLin(l.tail))
  }

  def maxIt(l: List[Int]): Int = {
    @tailrec
    def maxItAux(l: List[Int], max: Int): Int = {
      if (l.isEmpty)
        max
      else
        maxItAux(l.tail, Math.max(max, l.head))
    }

    if (l.isEmpty)
      throw new IllegalArgumentException("La lista no puede estar vacía")
    else
      maxItAux(l.tail, l.head)
  }

  def max(a: Int, b: Int): Int = {
    if (a > b) a
    else b
  }
}