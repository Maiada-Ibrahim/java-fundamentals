function and(a,b) {
  if (a === 1 && b === 1) {
    return 1
  } else {
    return 0
  }
}
function or(a,b) {
  if (a === 1)
    return 1
  if (b === 1)
    return 1
  else
    return 0
}
function xor(a,b) {
  if (and(a,b))
    return 0;
  return or(a,b);
}
console.log("xor 00", xor(0,0))
console.log("xor 01", xor(0,1))
console.log("xor 10", xor(1,0))
console.log("xor 11", xor(1,1))
console.log()
console.log("nor 00", nor(0,0))
console.log("nor 01", nor(0,1))
console.log("nor 10", nor(1,0))
console.log("nor 11", nor(1,1))
console.log()
