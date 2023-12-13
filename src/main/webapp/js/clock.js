document.addEventListener("DOMContentLoaded", function () {
    updateClock();

    setInterval(updateClock, 6000);
});

function updateClock() {
    let currentTime = new Date();
    const offset = 3; // (UTC+3)
    let moscowTime = new Date(currentTime.getTime() + offset * 60 * 60 * 1000);

    let hours = moscowTime.getHours();
    let minutes = moscowTime.getMinutes();
    let seconds = moscowTime.getSeconds();

    let clockDiv = document.getElementById("clock");
    clockDiv.innerHTML = addZeroBefore(hours) + ":" + addZeroBefore(minutes) + ":" + addZeroBefore(seconds);
}

function addZeroBefore(number) {
    return (number < 10 ? "0" : "") + number;
}
