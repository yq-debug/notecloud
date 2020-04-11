//退出登录
function logout(token) {
    window.location.href = "/account/logout.json?token=" + token;
};

//图片页面验证
function toImagePage(token) {
    window.location.href = "/image_page?token=" + token;
}

//文件页面验证
function toFilePage(token) {
    window.location.href = "/file_page?token=" + token;
}

//日程页面验证
function toSchedulePage(token) {
    window.location.href = "/schedule_page?token=" + token;
}

//后台管理页面验证
function toAdminPage(token) {
    window.location.href = "/admin?token=" + token;
}

//个人信息页面验证
function toInformationPage(token) {
    window.location.href = "/information?token=" + token;
}

//修改密码页面验证
function toResetPasswordPage(token) {
    window.location.href = "/resetPassword?token=" + token;
}




