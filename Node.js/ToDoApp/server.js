const express= require('express');
const app=express();


app.listen(7777,function(){
    console.log('listening in 7777')
});

app.get('/pet', function(req, res) { 
    res.send('펫용품 사시오')
  });

app.get('/beauty', function(req, res) { 
    res.send('뷰티 사시오')
  });  

app.get('/', function(req, res) { 
    res.send(__dirname+'/index.html')
  });  