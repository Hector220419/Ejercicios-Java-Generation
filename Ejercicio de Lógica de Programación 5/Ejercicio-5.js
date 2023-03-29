"use strict" // Buenas prácticas

const buttonValues = document.getElementById("buttonPress");
const buttonRemove = document.getElementById("buttonRemove");
const place = document.getElementById("tarjeta");
let array = [];

buttonValues.addEventListener("click", e =>{
    askValue();
});

buttonRemove.addEventListener("click", e =>{
    removeCard();
});

function askValue(){
    let randomNumber = random(0,100);
    console.log(randomNumber);

    let number = prompt("Introduce un numero entre 1 y 100 para adivinar el numero secreto");

    if(isNum(number)){
        array.push(number);
        if(number == randomNumber){
            alert("Felicidades, adivinaste el número secreto.");
            for(let i = 0; i< array.length; i++){
                card(i, array[i]);
            }
            console.log(array);
        }
        else{
            alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
        }
    }
    else{
        console.log("Opcion no valida");
    }
}

function isNum(val){
    return !isNaN(val)
  }

function random(min, max) {
    return Math.floor((Math.random() * (max - min + 1)) + min);
}


function card(p, n){
    place.innerHTML += `<div class="card text-aligment-center" style="width: 18rem;">
    <div class="card-body">
      <p class="card-text"> Intento [${p}]: ${n}</p>
    </div>
  </div>`;
}

function removeCard(){
    place.innerHTML = '';
}