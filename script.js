const languageSelect = document.getElementById('languageSelect');
const loadButton = document.getElementById('loadButton');
const employeeInfo = document.getElementById('employeeInfo');

loadButton.addEventListener('click', () => {
    const selectedLang = languageSelect.value;

    const employeeData = {
        en: { firstName: 'John', lastName: 'Doe', email: 'john.doe@example.com' },
        fa: { firstName: 'جان', lastName: 'دو', email: 'john.doe@example.com' },
        ja: { firstName: 'ジョン', lastName: 'ドウ', email: 'john.doe@example.com' }
    };

    const employee = employeeData[selectedLang];
    employeeInfo.innerHTML = `<p>${employee.firstName} ${employee.lastName} (${employee.email})</p>`;
});
