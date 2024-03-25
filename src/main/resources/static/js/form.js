
const checkboxes = document.querySelectorAll('input[type="checkbox"]');

// Add event listener to each checkbox
checkboxes.forEach(checkbox => {
    checkbox.addEventListener('change', function() {
        // Uncheck all checkboxes except the one clicked
        checkboxes.forEach(cb => {
            if (cb !== checkbox) {
                cb.checked = false;
            }
        });
    });
});


const form = document.getElementById('checkboxForm');
form.addEventListener('submit', function(event) {
    const checkboxes = document.querySelectorAll('input[type="checkbox"]:checked');
    if (checkboxes.length === 0) {
        alert('Choose any one option');
        event.preventDefault(); // Prevent form submission
    }
});
