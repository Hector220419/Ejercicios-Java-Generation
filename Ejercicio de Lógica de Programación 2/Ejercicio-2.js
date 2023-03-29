"use strict" // Buenas prácticas

const buttonValues = document.getElementById("buttonPress");
const place = document.getElementById("tarjeta");

buttonValues.addEventListener("click", e =>{
    askValues();
});

function askValues(){
let opc = prompt("Ingresa: \n1.Celsius "+
                    "\n2.Farenheit" + 
                    "\n3. Kelvin");

    if(opc == 1 || opc == 2 || opc == 3){
        let temp = prompt("Ingresa la temperatura");
        calTemp(opc, parseFloat(temp));
    }
    else{
        console.log("Opcion no valida");
    }
}

function calTemp(opc, temp){
    let tempC = 0, tempF = 0, tempK = 0;
    if(opc == 1){
        tempC = temp;
        tempF = (temp*1.8) + 32;
        tempK = temp + 273.15;
    }
    else if(opc == 2){
        tempF = temp;
        tempC = (temp-32) /1.8;
        tempK = tempC + 273.15;
    }
    else if(opc == 3){
        tempK = temp;
        tempC = temp - 273.15;
        tempF = (tempC*1.8) + 32;
    }

    let array = [tempC.toFixed(2), tempF.toFixed(2), tempK.toFixed(2)];
    let arrayNames = ["Grados Celsius: ", "Grados Farenheit: ", "Grados Kelvin: "]

    for(let i = 0; i <array.length; i++){
        card(array[i], arrayNames[i]);
    }

}

function card(t, n){
    place.innerHTML += `<div class="card" style="width: 18rem;">
    <div class="card-body">
      <p class="card-text"> ${n} ${t} °</p>
    </div>
  </div>`;
}