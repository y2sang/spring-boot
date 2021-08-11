let main = {
    init : function () {
        let _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        })

        $("#btn-update").on('click', function () {
            _this.update();
        });

        $("#btn-delete").on('click', function () {
            _this.delete();
        });
    },
    data : function () {
        return {
            title : $("#title").val(),
            author : $("#author").val(),
            content : $("#content").val()
        };
    },
    save : function () {
        let _this = this;
        $.ajax({
            type : 'POST',
            url : '/api/v1/posts',
            dataType : 'json',
            contentType : 'application/json; charset=utf-8',
            data : JSON.stringify(_this.data())
        }).done(function () {
            alert('글이 등록되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },
    update : function() {
        let _this = this;
        let id = $("#id").val();

        $.ajax({
            type : 'PUT',
            url : '/api/v1/posts/'+ id,
            dataType : 'json',
            contentType : 'application/json; charset=utf-8',
            data : JSON.stringify(_this.data())
        }).done(function () {
            alert('글이 수정되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },

    delete : function() {
        let _this = this;
        let id = $("#id").val();
        $.ajax({
            type : 'DELETE',
            url : '/api/v1/posts/'+ id,
            dataType : 'json',
            contentType : 'application/json; charset=utf-8',
            data : JSON.stringify(_this.data())
        }).done(function () {
            alert('글이 삭제되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }
};

main.init();