function convert() {
  var temperature = parseFloat(document.getElementById('inputTemp').value);
  var unit = document.getElementById('inputUnit').value;
  var resultElement = document.getElementById('result');
  var convertedTemp;

  if (unit === 'celsius') {
    convertedTemp = (temperature * 9/5) + 32;
    resultElement.innerText = temperature + '°C is equal to ' + convertedTemp + '°F';
  } else {
    convertedTemp = (temperature - 32) * 5/9;
    resultElement.innerText = temperature + '°F is equal to ' + convertedTemp.toFixed(2) + '°C';
  }
}
