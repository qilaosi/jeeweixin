
function datetimeFormat(longTypeDate, fullFormat){    
  var dateTypeDate = "";    
  var date = new Date();    
  date.setTime(longTypeDate);    
  dateTypeDate += date.getFullYear();   //年    
  dateTypeDate += "-" + getMonth(date); //月     
  dateTypeDate += "-" + getDay(date);   //日    
  if(fullFormat){
    dateTypeDate += " " + getHours(date);   //时    
    dateTypeDate += ":" + getMinutes(date);     //分  
    dateTypeDate += ":" + getSeconds(date);     //分  
  }
  return dateTypeDate;  
} 

function formatTime(date) {
  var year = date.getFullYear()
  var month = date.getMonth() + 1
  var day = date.getDate()

  var hour = date.getHours()
  var minute = date.getMinutes()
  var second = date.getSeconds()

  return [year, month, day].map(formatNumber).join('/') + ' ' + [hour, minute, second].map(formatNumber).join(':')
}

//返回 01-12 的月份值     
function getMonth(date){    
  var month = "";    
  month = date.getMonth() + 1; 
  if(month<10){    
      month = "0" + month;    
  }    
  return month;    
}    
//返回01-30的日期    
function getDay(date){    
  var day = "";    
  day = date.getDate();    
  if(day<10){    
      day = "0" + day;    
  }    
  return day;    
}  
//小时  
function getHours(date){  
  var hours = "";  
  hours = date.getHours();  
  if(hours<10){    
      hours = "0" + hours;    
  }    
  return hours;    
}  
//分  
function getMinutes(date){  
  var minute = "";  
  minute = date.getMinutes();  
  if(minute<10){    
      minute = "0" + minute;    
  }    
  return minute;    
}  
//秒  
function getSeconds(date){  
  var second = "";  
  second = date.getSeconds();  
  if(second<10){    
      second = "0" + second;    
  }    
  return second;    
}

function formatNumber(n) {
  n = n.toString()
  return n[1] ? n : '0' + n
}

module.exports = {
  formatTime: formatTime,
  datetimeFormat: datetimeFormat
}
