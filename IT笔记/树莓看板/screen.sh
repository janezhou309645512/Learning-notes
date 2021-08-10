xset dpms 0 0 0
xset s off
su - pi
xhost +
chromium-browser --app=http://10.0.8.11:8080/messervice/kanabnProductivityTrend_productivityTrendPage.action &