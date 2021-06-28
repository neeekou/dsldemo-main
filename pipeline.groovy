def firstTest() {
    for(x in 1..5){
        println x
    }
}

def testTwo() {
    for(x in 6..10){
        println x
    }
}
...

return [
    firstTest: this.&firstTest,
    testTwo: this.&testTwo
]