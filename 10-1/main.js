//問１

function isEven(num) {
    return num % 2 === 0;
}

let numbers = [2, 5, 12, 13, 15, 18, 22];
console.log(numbers.filter(isEven)+ 'は偶数です'); 



//問２

class Car{
    constructor(gass, num){
        this.gass = gass;
        this.num= num;
    }

    getNumGas(){
        console.log(`ガソリンは${this.gass}です。ナンバーは${this.num}です。`);
    }
}

let NumGas = new Car('20.5' , '1234');
NumGas.getNumGas();