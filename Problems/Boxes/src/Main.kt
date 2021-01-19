fun main(args: Array<String>) {
    val (x1, y1, z1) = readLine()!!.split(" ").map(String::toInt).sorted()
    val (x2, y2, z2) = readLine()!!.split(" ").map(String::toInt).sorted()

    val boxesAreEqualMsg = "Box 1 = Box 2"
    val box1IsBiggerMsg = "Box 1 > Box 2"
    val box2IsBiggerMsg = "Box 1 < Box 2"
    val incomparableMsg = "Incomparable"

//    println("$x1 $y1 $z1")
//    println("$x2 $y2 $z2")

    if (x1 > z2) {
        println(box1IsBiggerMsg)
    } else if (x2 > z1) {
        println(box2IsBiggerMsg)
    } else if (x1 == x2) {
        if (y1 == y2) {
            if (z1 == z2) {
                println(boxesAreEqualMsg)
            } else if (z1 > z2) {
                println(box1IsBiggerMsg)
            } else {
                println(box2IsBiggerMsg)
            }
        } else if (y1 > y2) {
            if (z1 == z2) {
                println(box1IsBiggerMsg)
            } else if (z1 > z2) {
                println(box1IsBiggerMsg)
            } else {
                println(incomparableMsg)
            }
        } else if (y1 < y2) {
            if (z1 == z1) {
                println(box2IsBiggerMsg)
            } else if (z1 > z2) {
                println(incomparableMsg)
            } else {
                println(box2IsBiggerMsg)
            }
        }
    } else if (x1 > x2) {
        if (y1 == y2) {
            if (z1 == z2) {
                println(box1IsBiggerMsg)
            } else if (z1 > z2) {
                println(box1IsBiggerMsg)
            } else {
                println(incomparableMsg)
            }
        } else if (y1 > y2) {
            if (z1 == z2) {
                println(box1IsBiggerMsg)
            } else if (z1 > z2) {
                println(box1IsBiggerMsg)
            } else {
                println(incomparableMsg)
            }
        } else if (y1 < y2) {
            if (z1 == z2) {
                println(incomparableMsg)
            } else if (z1 > z2) {
                println(incomparableMsg)
            } else {
                println(incomparableMsg)
            }
        }
    } else if (x1 < x2) {
        if (y1 == y2) {
            if (z1 == z2) {
                println(box2IsBiggerMsg)
            } else if (z1 > z2) {
                println(incomparableMsg)
            } else {
                println(box2IsBiggerMsg)
            }
        } else if (y1 > y2) {
            if (z1 == z2) {
                println(incomparableMsg)
            } else if (z1 > z2) {
                println(incomparableMsg)
            } else {
                println(incomparableMsg)
            }
        } else if (y1 < y2) {
            if (z1 == z2) {
                println(box2IsBiggerMsg)
            } else if (z1 > z2) {
                println(incomparableMsg)
            } else {
                println(box2IsBiggerMsg)
            }
        }
    }

//    if (x1 == x2) {
//        if (y1 == y2) {
//            if (z1 == z2) {
//                println(boxesAreEqualMsg)
//            } else if (z1 < z2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 == z2) {
//            if (z1 == y2) {
//                println(boxesAreEqualMsg)
//            } else if (z1 < y2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 < y2) {
//            if (z1 == z2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < z2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > y2) {
//            if (z1 == z2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < z2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 < z2) {
//            if (z1 == y2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < y2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > z2) {
//            if (z1 == y2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < y2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        }
//    } else if (x1 == y2) {
//        if (y1 == x2) {
//            if (z1 == z2) {
//                println(boxesAreEqualMsg)
//            } else if (z1 < z2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 == z2) {
//            if (z1 == x2) {
//                println(boxesAreEqualMsg)
//            } else if (z1 < x2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 < x2) {
//            if (z1 == z2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < z2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > x2) {
//            if (z1 == z2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < z2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 < z2) {
//            if (z1 == x2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < x2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > z2) {
//            if (z1 == x2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < x2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        }
//    } else if (x1 == z2) {
//        if (y1 == y2) {
//            if (z1 == x2) {
//                println(boxesAreEqualMsg)
//            } else if (z1 < x2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 == x2) {
//            if (z1 == y2) {
//                println(boxesAreEqualMsg)
//            } else if (z1 < y2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 < y2) {
//            if (z1 == x2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < x2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > y2) {
//            if (z1 == x2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < x2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 < x2) {
//            if (z1 == y2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < y2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > x2) {
//            if (z1 == y2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < y2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        }
//    } else if (x1 < x2) {
//        if (y1 == y2) {
//            if (z1 == z2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < z2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 == z2) {
//            if (z1 == y2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < y2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 < y2) {
//            if (z1 == z2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < z2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > y2) {
//            if (z1 == z2) {
//                println(incomparableMsg)
//            } else if (z1 < z2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 < z2) {
//            if (z1 == y2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < y2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > z2) {
//            if (z1 == y2) {
//                println(incomparableMsg)
//            } else if (z1 < y2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        }
//    } else if (x1 > x2) {
//        if (y1 == y2) {
//            if (z1 == z2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < z2) {
//                println(incomparableMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 == z2) {
//            if (z1 == y2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < y2) {
//                println(incomparableMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 < y2) {
//            if (z1 == z2) {
//                println(incomparableMsg)
//            } else if (z1 < z2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > y2) {
//            if (z1 == z2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < z2) {
//                println(incomparableMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 < z2) {
//            if (z1 == y2) {
//                println(incomparableMsg)
//            } else if (z1 < y2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > z2) {
//            if (z1 == y2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < y2) {
//                println(incomparableMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        }
//    } else if (x1 < y2) {
//        if (y1 == x2) {
//            if (z1 == z2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < z2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 == z2) {
//            if (z1 == x2) {
//                println(boxesAreEqualMsg)
//            } else if (z1 < x2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 < x2) {
//            if (z1 == z2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < z2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > x2) {
//            if (z1 == z2) {
//                println(incomparableMsg)
//            } else if (z1 < z2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 < z2) {
//            if (z1 == x2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < x2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > z2) {
//            if (z1 == x2) {
//                println(incomparableMsg)
//            } else if (z1 < x2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        }
//    } else if (x1 > y2) {
//        if (y1 == x2) {
//            if (z1 == z2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < z2) {
//                println(incomparableMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 == z2) {
//            if (z1 == x2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < x2) {
//                println(incomparableMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 < x2) {
//            if (z1 == z2) {
//                println(incomparableMsg)
//            } else if (z1 < z2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > x2) {
//            if (z1 == z2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < z2) {
//                println(incomparableMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 < z2) {
//            if (z1 == x2) {
//                println(incomparableMsg)
//            } else if (z1 < x2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > z2) {
//            if (z1 == x2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < x2) {
//                println(incomparableMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        }
//    } else if (x1 < z2) {
//        if (y1 == y2) {
//            if (z1 == x2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < x2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 == x2) {
//            if (z1 == y2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < y2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 < y2) {
//            if (z1 == x2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < x2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > y2) {
//            if (z1 == x2) {
//                println(incomparableMsg)
//            } else if (z1 < x2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 < x2) {
//            if (z1 == y2) {
//                println(box2IsBiggerMsg)
//            } else if (z1 < y2) {
//                println(box2IsBiggerMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > x2) {
//            if (z1 == y2) {
//                println(incomparableMsg)
//            } else if (z1 < y2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        }
//    } else if (x1 > z2) {
//        if (y1 == y2) {
//            if (z1 == x2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < x2) {
//                println(incomparableMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 == x2) {
//            if (z1 == y2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < y2) {
//                println(incomparableMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 < y2) {
//            if (z1 == x2) {
//                println(incomparableMsg)
//            } else if (z1 < x2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > y2) {
//            if (z1 == x2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < x2) {
//                println(incomparableMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        } else if (y1 < x2) {
//            if (z1 == y2) {
//                println(incomparableMsg)
//            } else if (z1 < y2) {
//                println(incomparableMsg)
//            } else {
//                println(incomparableMsg)
//            }
//        } else if (y1 > x2) {
//            if (z1 == y2) {
//                println(box1IsBiggerMsg)
//            } else if (z1 < y2) {
//                println(incomparableMsg)
//            } else {
//                println(box1IsBiggerMsg)
//            }
//        }
//    }
}
