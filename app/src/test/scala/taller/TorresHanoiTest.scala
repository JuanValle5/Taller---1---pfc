package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TorresHanoiTest extends AnyFunSuite{
  val objTorre = new TorresHanoi()

  test("1") {
    assert(objTorre.torresHanoi(1, 1, 2, 3) == List((1, 3)), "Error en test 1 disco")
  }
  test("2") {
    assert(objTorre.torresHanoi(2, 1, 2, 3) == List((1, 2), (1, 3), (2, 3)), "Error en test 2 discos")
  }
  test("3") {
    assert(objTorre.torresHanoi(3, 1, 2, 3) == List((1, 3), (1, 2), (3, 2), (1, 3), (2, 1), (2, 3), (1, 3)), "Error en test 3 discos")
  }
  test("4") {
    assert(objTorre.torresHanoi(0, 1, 2, 3) == List(), "Error en test sin discos")
  }
  test("5") {
    assert(objTorre.movsTorresHanoi(1) == 1, "Error en test 1 disco")
  }
  test("6") {
    assert(objTorre.movsTorresHanoi(2) == 3, "Error en test 2 discos")
  }
  test("7") {
    assert(objTorre.movsTorresHanoi(3) == 7, "Error en test 3 discos")
  }
  test("8"){
    assertThrows[IllegalArgumentException] {
      objTorre.movsTorresHanoi(0)  // Caso con n igual a 0
    }
  }
  test("9"){
    assertThrows[IllegalArgumentException] {
      objTorre.movsTorresHanoi(-1)  // Caso con n menor que 0
    }
  }



}