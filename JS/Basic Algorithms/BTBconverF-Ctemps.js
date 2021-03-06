var readline = require('readline'),
    rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });


function convertTemp() {

    let newTemp, tempType, newTempType;

    rl.question('Enter a temperature define it as Celsius or Fahrenheit by ending the temp with C or F\nTemperature and Temperature-Type: ', (tempIn) => {
        
        tempIn = tempIn.trim().toLowerCase();

        if (tempIn.includes('c') && !tempIn.includes('f')) {
            tempType = 'Celsius';
            newTempType = 'Fahrenheit';

        } else if (tempIn.includes('f') && !tempIn.includes('c')) {
            tempType = 'Fahrenheit';
            newTempType = 'Celsius';

        } else {
            console.log('\nYou did not specify the temperature type correctly, please try again.\n\n');
            convertTemp();
            return

        }

            tempIn = parseInt(tempIn.replace(/[a-z]/g, ''));
            console.log(tempIn);
            
        if (!isNaN(tempIn)) {
            if (tempType = 'Fahrenheit') {
                newTemp = (tempIn - 32)* (5/9);
                newTemp = Math.round(newTemp * 10)/10;
                
            } else {
                newTemp = (tempIn * (9/5)) + 32;
                newTemp = Math.round(newTemp * 10)/10;    
                
            }
        } else {
            console.log('\nYou did not specify the temperature correctly, please try again.\n Example: 32 F Output: "Your temperature in Celsius is 0."  \n\n');
            convertTemp();
            return
            
        }
            

            console.log(`\n______________________________________________\nYour temperature in ${newTempType} is ${newTemp}.\n______________________________________________\n`);

        rl.question('Do you want to try again?\(\'no\' to exit\): ', (yon) => {
            if (yon == 'no') {
                console.log('\nThe program will not end...');
                rl.close()

            } else {
                console.log('The program will run once more...\n\n');
                convertTemp();

            }
        });
        
    });
}
convertTemp()