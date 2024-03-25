/// Toaster

function showToaster() {
    var toaster = document.getElementById('toaster');
    toaster.textContent = 'This is a toaster notification.';
    toaster.classList.add('show');
    setTimeout(function() {
        toaster.classList.remove('show');
        toaster.classList.add('hide');
    }, 3000); // Adjust the time duration as needed (in milliseconds)
}