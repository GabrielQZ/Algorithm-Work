function rot13(str) { // LBH QVQ VG!
str = str.toUpperCase();
let alpha = /[A-Z]/, decoded = '';
  
  for (var i = 0; i < str.length; i++) {
    //   console.log(str[i]);
    
      
      if (alpha.test(str[i])) {
          let newLetter = str.charCodeAt(i) + 13;

          if (newLetter > 90) {
              newLetter = 64 + (newLetter - 90);
          };

        //   console.log((newLetter));
          
        decoded += String.fromCharCode(newLetter)
      } else {
          decoded += str[i];
      }
  }
  console.log(decoded)
  return decoded;
}

// Change the inputs below to test
rot13("uryyb zl anzr vf tnoevry furezna naq v perngrq guvf pbqr gb grfg zl novyvgl gb perngr n ebg13 pvcure");
