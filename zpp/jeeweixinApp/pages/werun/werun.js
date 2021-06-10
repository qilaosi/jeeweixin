// pages/werun/werun.js
var app = getApp();
var Server = require("../../server/Server.js")
var util = require("../../utils/util.js")
Page({

  /**
   * 页面的初始数据
   */
  data: {

  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.getWeRunStepInfo();
  },

  //获取运动步数
  getWeRunStepInfo: function(){
    wx.login({
      success: res => {
        var code = res.code;//code
        wx.getWeRunData({
          success: res=> {
            var iv = res.iv;
            var encryptedData = res.encryptedData;
            Server.encryptStepInfoData(encryptedData,iv,code,res=>{
              var resData = res.data.data;
              //console.log(resData)
              this.setData({
                stepInfoList: this.prepareSteInfoList(resData.stepInfoList)
              })
            })
          }
        });
      }
    });
  },

  prepareSteInfoList: function(stepInfoList){
    for(var i in stepInfoList){
      stepInfoList[i].timestamp = util.datetimeFormat(stepInfoList[i].timestamp*1000)
    }
    return stepInfoList
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})