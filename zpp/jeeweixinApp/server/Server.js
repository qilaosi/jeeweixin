
const app = getApp();

//获取用户运动步数
function encryptStepInfoData(encryptedData, iv, code, cb){
  wx.request({
    url: app.CONTEXT_URL + '/api/miniprogram/encryptStepInfoData',
    method: "POST",
    data: {
      "encryptedData":encryptedData,
      "iv":iv,
      "code":code
    },
    header: {
      'content-type': 'application/x-www-form-urlencoded' // 默认值
    },
    success: function (res) {
      if (typeof cb === "function") {
        cb(res);
      }
    },
    fail: function (res) {
      console.log(res);
    }
  });
}

//export
module.exports = {
  encryptStepInfoData: encryptStepInfoData
}


