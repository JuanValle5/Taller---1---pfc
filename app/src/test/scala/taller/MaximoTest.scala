package taller
import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class MaximoTest extends AnyFunSuite {
  val objMaximoNum = new Maximo()
  test("Lista vacia"){
    assertThrows[IllegalArgumentException]{
      objMaximoNum.maxLin(List())
    }
  }

  test("Encontrar el maximo de una lista de 5 numeros") {
    assert(objMaximoNum.maxLin(List(1, 2, 3, 4, 5)) == 5)
  }

  test("Encontrar el maximo de una lista de 10 numeros") {
    assert(objMaximoNum.maxLin(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) == 10)
  }

  test("Encontrar el maximo de una lista de 15 numeros") {
    assert(objMaximoNum.maxLin(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)) == 15)
  }

  test("MaximoLista RecursivaCola = 5") {
    assert(objMaximoNum.maxIt(List(1,2,3,4,5)) == 5)
  }

  test("MaximoLista RecursivaCola = 10") {
    assert(objMaximoNum.maxIt(List(1, 2, 3, 4, 5, 5,10,10)) == 10)
  }

  test("MaximoLista RecursivaCola = 12") {
    assert(objMaximoNum.maxIt(List(12)) == 12)
  }

  test("Maximo Lista Vacia RecursivaCola") {
    assertThrows[IllegalArgumentException] {
      objMaximoNum.maxIt(List())
    }
  }
}
