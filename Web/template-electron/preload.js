window.addEventListener('DOMContentLoaded', () => {
    const versionTypeArr = ['node', 'chrome', 'electron'];
    for (let i = 0; i < versionTypeArr.length; i++) {
        const versionType = versionTypeArr[i];
        const versionTypeSpan = document.querySelector(`#${versionType}`);
        versionTypeSpan.innerHTML = process.versions[versionType];
    }
});