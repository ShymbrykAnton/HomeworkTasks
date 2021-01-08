'use strict'

function getSum(number1, number2) {
    return number1 + number2;
}

function getDifference(number1, number2) {
    return number1 - number2;
}

function getMultiply(number1, number2) {
    return number1 * number2;
}

function getDivision(number1, number2) {
    if (number2 === 0) {
        throw new Error("На ноль делить нельзя")
    }
    return number1 / number2;
}

function getRoot(number1, number2) {
    if (number2 === 0) {
        throw new Error("Корень нулевой стпени получить нельзя")
    }
    return number1 ** (1 / number2);
}

function getPow(number1, number2) {
    return number1 ** number2
}

function calculator(operator) {
    let result;
    let number1 = Number(document.getElementById("Число 1").value);
    let number2 = Number(document.getElementById("Число 2").value);
    try {
        switch (operator) {
            case '+':
                result = getSum(number1, number2);
                break;
            case'-':
                result = getDifference(number1, number2)
                break;
            case '*':
                result = getMultiply(number1, number2);
                break;
            case'/':
                result = getDivision(number1, number2)
                break;
            case 'Корень':
                result = getRoot(number1, number2);
                break;
            case'Степень':
                result = getPow(number1, number2)
                break;
            default:
                result = "Вы ввели не цифры!"
                break;
        }
    } catch
        (Error) {
        document.getElementById("result").innerHTML = "На ноль делить нельзя";
    }
    document.getElementById("result").innerHTML = number1 + " " + operator + " " + number2 + " = " + result;
}
