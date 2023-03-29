"use strict" // Buenas prácticas

const buttonValues = document.getElementById("buttonPress");
const place = document.getElementById("tarjeta");

buttonValues.addEventListener("click", e =>{
    askValue();
});

function askValue(){
let number = prompt("Ingresa un numero");

    if(isNum(number)){
        getFibonacci(number);
    }
    else{
        console.log("Opcion no valida");
    }
}

function isNum(val){
    return !isNaN(val)
  }

function getFibonacci(number) {
    const array = [0, 1];
    for (let i = 2; i<= number; i++) {
        array[i] = array[i -1] + array[i - 2];
    }
    
    for(let i = 0; i< array.length; i++){
        card(i,array[i]);
    }
    
}

function card(p, n){
    place.innerHTML += `<div class="card text-aligment-center" style="width: 18rem;">
    <div class="card-body">
      <p class="card-text"> Posicion [${p}]: ${n}</p>
    </div>
  </div>`;
}