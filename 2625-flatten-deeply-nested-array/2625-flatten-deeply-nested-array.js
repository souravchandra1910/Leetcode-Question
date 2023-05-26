/**
 * @param {any[]} arr
 * @param {number} depth
 * @return {any[]}
 */
let flat = function (arr, n) {
    if (n === 0) {
    return arr;
  }

  let ans = [];

  for (let i = 0; i < arr.length; i++) {
    if (Array.isArray(arr[i])) {
      const subArray = flat(arr[i], n - 1);
      ans.push(...subArray);
    } else {
      ans.push(arr[i]);
    }
  }
  return ans; 
};