import axios from 'axios';

export default {
    methods: {
        async $api(url, data){
            return (await axios({
                method: 'post',
                url,
                data
            }))
        }
    }
}