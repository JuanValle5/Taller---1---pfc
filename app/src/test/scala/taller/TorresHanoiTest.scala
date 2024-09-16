package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TorresHanoiTest extends AnyFunSuite{
  val objTorre = new TorresHanoi()

  test("Torres de Hanoi con 1 disco") {
    assert(objTorre.torresHanoi(1, 1, 2, 3) == List((1, 3)), "Error en test 1 disco")
  }
  test("Torres de Hanoi con 2 discos") {
    assert(objTorre.torresHanoi(2, 1, 2, 3) == List((1, 2), (1, 3), (2, 3)), "Error en test 2 discos")
  }
  test("Torres de Hanoi con 3 discos") {
    assert(objTorre.torresHanoi(3, 1, 2, 3) == List((1, 3), (1, 2), (3, 2), (1, 3), (2, 1), (2, 3), (1, 3)), "Error en test 3 discos")
  }
  test("Torres de Hanoi sin discos") {
    assert(objTorre.torresHanoi(0, 1, 2, 3) == List(), "Error en test sin discos")
  }
  test("Torres de Hanoi Movimientos con 1 disco") {
    assert(objTorre.movsTorresHanoi(1) == 1, "Error en test 1 disco")
  }
  test("Torres de Hanoi Movimientos con 2 discos") {
    assert(objTorre.movsTorresHanoi(2) == 3, "Error en test 2 discos")
  }
  test("Toores de Hanoi Movimientos con 3 discos") {
    assert(objTorre.movsTorresHanoi(3) == 7, "Error en test 3 discos")
  }
  test("Torres de Hanoi Movimientos sin discos") {
    assert(objTorre.movsTorresHanoi(0) == 0, "Error en test sin discos")
  }



}