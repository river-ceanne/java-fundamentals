function nor(a,b) {
  return not(or(a,b));
}

function add1(a,b) {
  overflow = and(a,b);
  sum = xor(a,b);
  return {sum, overflow};
}