$(document).ready(function () {

    $("button").click(function(){
        alert(this.id);
            $.post('/toTopic',
                {
                    moduleId: this.id
                });
    });
});