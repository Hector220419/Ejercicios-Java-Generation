"use strict" // Buenas prácticas

const buttonValues = document.getElementById("buttonPress");
const place = document.getElementById("tarjeta");

buttonValues.addEventListener("click", e =>{
    askValue();
});

function askValue(){
let number = prompt("Ingresa un numero");

    if(isNum(number)){
        factorial(number);
    }
    else{
        console.log("Opcion no valida");
    }
}

function isNum(val){
    return !isNaN(val)
  }

function factorial (n) {
    let total = 1; 
	for (let i = 1; i<=n; i++) {
		total *= i; 
	}
	card(n, total); 
}

function card(n, t){
    place.innerHTML += `<div class="card text-aligment-center" style="width: 18rem;">
    <div class="card-body">
      <p class="card-text"> Numero: ${n} -> Factorial: ${t} </p>
    </div>
  </div>`;
}

