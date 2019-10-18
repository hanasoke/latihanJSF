/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function hiddenVal()
{
    const x = document.getElementById('form:value1').value;
    alert(x);
}

function textVal()
{
    const x = document.getElementById('form:value2').value;
    alert(x);
}

function secretVal()
{
    const x = document.getElementById('form:value3').value;
    alert(x);
}

function jumlahkan()
{
    const val1 = document.getElementById('form2:val1').value;
    const val2 = document.getElementById('form2:val2').value;
    const x = parseInt(val1);
    const y = parseInt(val2);
    
    const hasil = x + y;
    alert("hasil penjumlahan adalah " + hasil);
}

function kurangkan()
{
    const val1 = document.getElementById('form2:val1').value;
    const val2 = document.getElementById('form2:val2').value;
    const x = parseInt(val1);
    const y = parseInt(val2);
    
    const hasil = x - y;
    alert("hasil pengurangan adalah " + hasil);
}

function kalikan()
{
    const val1 = document.getElementById('form2:val1').value;
    const val2 = document.getElementById('form2:val2').value;
    const x = parseInt(val1);
    const y = parseInt(val2);
    
    const hasil = x * y;
    alert("hasil perkalian adalah " + hasil);
}

function bagi()
{
    const val1 = document.getElementById('form2:val1').value;
    const val2 = document.getElementById('form2:val2').value;
    const x = parseInt(val1);
    const y = parseInt(val2);
    
    const hasil = x / y;
    alert("hasil pembagian adalah " + hasil);
}

function show()
{
    const x = document.getElementById('form3:valVal').value;
    const y = parseInt(x);
    
    if (x%2 == 0 ) {
        alert("GENAP");
    } else {
        alert("GANJIL");
    }
}







