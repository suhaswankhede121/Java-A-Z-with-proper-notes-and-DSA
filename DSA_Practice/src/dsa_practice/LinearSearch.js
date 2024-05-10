function linearSearch(array, target) {
  for (let i = 0; i < array.length; i++) {
    if (array[i] === target) {
      return true
    }
  }
  return false;
}

const array = [1, 2, 3, 4, 5];
const target = 7;

console.log(linearSearch(array, target));
