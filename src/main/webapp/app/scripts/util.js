/**
 * This function coerces a string into a string literal type.
 * Using tagged union types in TypeScript 2.0, this enables
 * powerful typechecking of our reducers.
 *
 * Since every action label passes through this function it
 * is a good place to ensure all of our action labels
 * are unique.
 */
"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const typeCache = {};
function type(label) {
    if (typeCache[label]) {
        throw new Error(`Action type "${label}" is not unique"`);
    }
    typeCache[label] = true;
    return label;
}
exports.type = type;
function deepCopy(oldObj) {
    var newObj = oldObj;
    if (oldObj && typeof oldObj === "object") {
        newObj = Object.prototype.toString.call(oldObj) === "[object Array]" ? [] : {};
        for (var i in oldObj) {
            newObj[i] = this.deepCopy(oldObj[i]);
        }
    }
    return newObj;
}
exports.deepCopy = deepCopy;
//# sourceMappingURL=util.js.map