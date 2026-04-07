const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('Enter student name: ', name => {
  readline.question('Enter number of registered units: ', units => {
    const status = parseInt(units) > 7 ? "Overload - Approval Required" : "Registration Accepted";
    console.log(`\n--- Final Summary ---\nStudent Name: ${name}\nUnits: ${units}\nStatus: ${status}`);
    readline.close();
  });
});node 