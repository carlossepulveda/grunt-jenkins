/// <reference path="counter.js">
"use strict";
 
describe("Counter tests", function () {
 
    it("Add gives the correct result", function () {
        // Arrange
        var x = 1;
        var y = 2;
        var expected = 3;
 
        // Assert
        expect(plus(x, y)).toBe(expected);
    });
});