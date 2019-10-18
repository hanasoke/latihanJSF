/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function klikSubmit()
{
    const nama = document.getElementById('form:valueNama').value;
    const place = document.getElementById('form:valuePlace').value;
    const birth = document.getElementById('form:valueBirth').value;
    const address = document.getElementById('form:valueAddress').value;
    const email = document.getElementById('form:valueEmail').value;
    const major = document.getElementById('form:valueMajor').value;
    alert("nama : " + nama + "\nplace : " + place + "\nbirth : " + birth + "\naddress : " + address + "\nemail : " + email + "\nmajor : " + major);
}




