/**
 * @param {Function[]} functions
 * @param {number} n
 * @return {Function}
 */
var promisePool = async function (functions, n) {
  return new Promise((resolve, reject) => {
    try {
      let pending = 0;
      let idx = 0;

      async function func() {
        await functions[idx - 1]();
        pending--;
        helper();
      }

      async function helper() {
        if (idx >= functions.length) {
          if (pending === 0) {
            resolve();
          }
          return;
        }

        while (pending < n && idx < functions.length) {
          pending++;
          idx++;
          func();
        }
      }

      helper();
    } catch (e) {
      console.log(e.message);
    }
  });
};
/**
 * const sleep = (t) => new Promise(res => setTimeout(res, t));
 * promisePool([() => sleep(500), () => sleep(400)], 1)
 *   .then(console.log) // After 900ms
 */
