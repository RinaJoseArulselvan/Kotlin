import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking

fun insertionSort(array: IntArray,n: Int) {


    for (i in 1 until n) {
        val key = array[i]
        var j = i - 1

        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j]
            j--
        }

        array[j + 1] = key
    }
}

fun bubbleSort(arr: IntArray, n: Int) // function to implement bubble sort
{
    var j: Int
    var temp: Int
    var i: Int = 0
    while (i < n) {
        j = i + 1
        while (j < n) {
            if (arr[j] < arr[i]) {
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
            j++
        }
        i++
    }

}

fun selectionSort(arr: IntArray, n: Int) {
    var j: Int
    var small: Int
    var i: Int = 0
    while (i < n - 1) {
        small = i
        j = i + 1
        while (j < n) {
            if (arr[j] < arr[small]) small = j
            j++
        }

        val temp = arr[small]
        arr[small] = arr[i]
        arr[i] = temp
        i++
    }

}


fun main() {
   var sortingResults = runBlocking {
        var array = intArrayOf(23, 21, 25, 34, 32)
        var array1 = intArrayOf(2,5,4,3,6)
        var array2 = intArrayOf(12,11,13,16,18)
        var size = array.size
        var insertionSort = async {
         insertionSort(array, size)
         println("Sorted array of insertion sort : ${array.joinToString()}")
       }
      var bubbleSort = async {
           bubbleSort(array1, array1.size)
            println("Sorted array of bubble sort: ${array1.joinToString()}")
      }
       var selectionSort = async {
            selectionSort(array2, array2.size)
         println("Sorted array of selection sort : ${array2.joinToString()}")
        }
         awaitAll(insertionSort,bubbleSort,selectionSort)
   }
}




