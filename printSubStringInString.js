function printSubstringsInString() {
  var input = "abc"
  var arrayOfCharacters = input.split('')
  var results = []

  arrayOfCharacters.forEach(function (character,i) {
  // Outer loop which loops over all of the characters from the input string
  // first time round
    // character = a
    // i = 0
  // second time round
    // character = b
    // i = 1
  // third time round
    // character = c
    // i = 2
  // inner loop which loops over all of the characters with + 1 index
    for(var nextIndex = i + 1; nextIndex <= input.length; nextIndex++){
  // Outer first time round
    // first time round
      // nextIndex = 1
      // input slice cuts it from 0,1
      // substring = a
    // second time round
      // nextIndex = 2
      // input slice cuts it from 0,2
      // substring = ab
    // third time round
      // nextIndex = 3
      // input slice cuts it from 0,3
      // substring = abc
  // Outer second time round
    // first time round
      // nextIndex = 2
      // input slice cuts it from 1,2
    // second time round
      // nextIndex = 3
      // input slice cuts it from 1,3
      // substring = bc
  // Outer third time round
    // first time round
      // nextIndex = 3
      // input slice cuts it from 2,3
      // substring = c
      var substring = input.slice(i,nextIndex)
      console.log(substring)
      results.push()
    }
  })
}
