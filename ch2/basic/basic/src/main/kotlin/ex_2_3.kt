fun main() {
    // 2-3
    val p = Person(first = "North", middle = null, last = "West")
    if (p.middle != null) {
        val middleNameLength = p.middle.length;
    }

    // 2-4
    var p2 = Person(first = "North", middle = null, last = "West")
    if (p2.middle != null) {
        // var이기 때문에 if 문으로 체크를 했더라도, 중간에 값이 변경될 수 있다.
        // 따라서 null이 올 가능성이 있기 때문에 허용하지 않는다.
        // val middleNameLength2 = p2.middle.length;

        val middleNameLength2 = p2.middle!!.length;
    }
}


