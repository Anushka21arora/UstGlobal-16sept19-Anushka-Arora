var todayDate=new Date();
console.log('todays Date' ,todayDate);
console.log('day',todayDate.getDay());
console.log('Month',todayDate.getMonth());
console.log('year',todayDate.getFullYear());
console.log('date',todayDate.getDate());
console.log(todayDate.getHours());
var constMilli = new Date(0);
console.log('Date',constMilli);
var constString = new Date('Apr 4');
console.log('date String Constructor',constString);
var constYear = new Date(2017,10);
console.log('date Year Constructor',constYear);

console.log(Math.random()*100);


var day = todayDate.getDay();
switch(day){

case 0:
    console.log('sunday');
    break;
    case 1:
    console.log('monday');
    break;
    case 2:
    console.log('tuesday');
    break;
    case 3:
    console.log('wed');
    break;
    case 4:
    console.log('thu');
    break;
    case 5:
    console.log('fri');
    break;
    case 6:
    console.log('sat');
    break;




}
var month = todayDate.getMonth();
switch(month){

    case 0:
        console.log('jan');
        break;
        case 1:
        console.log('feb');
        break;
        case 2:
        console.log('mar');
        break;
        case 3:
        console.log('apr');
        break;
        case 4:
        console.log('may');
        break;
        case 5:
        console.log('jun');
        break;
        case 6:
        console.log('jul');
        break;
        case 7:
        console.log('aug');
        break;
        case 8:
        console.log('sept');
        break;
          case 9:
       console.log('oct');
       break;
       case 10:
      console.log('nov');
     break;
        case 11:
     console.log('dec');
        break;
                            
    
    
    
    }