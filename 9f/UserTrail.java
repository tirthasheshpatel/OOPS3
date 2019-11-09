class UserTrail
{
        int val1;
        int val2;

        UserTrail(int val1, int val2)
        {
            this.val1 = val1;
            this.val2 = val2;
        }

        public boolean show()
        {
            return (val1>0 && val2>0);   
        }
}