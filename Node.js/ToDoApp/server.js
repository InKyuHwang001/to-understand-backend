const express= require('express');
const app=express();

app.use(express.urlencoded({extended: true})) 

app.get('/', function(req, res) { 
    res.send(__dirname+'/index.html')
  });  

app.get('/write', function(req, res) { 
    res.send(__dirname+'/write.html')
  });    

  
app.post('/add', function(요청, 응답){
  응답.send('전송완료')
  console.log(요청.body.date);
  console.log(요청.body.title);
})