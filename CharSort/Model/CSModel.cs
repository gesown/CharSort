using System;
using System.Collections.Generic;
using System.Text;

namespace CharSort.model
{
    class CSModel : ICSModel
    {
        public CSModel()
        {
            startASCIILetters = 0x41;
            startASCIINumbers = 0x30;
            endASCIILetters = 0x7a;
            endASCIINumbers = 0x39;
        }
        public int startASCIINumbers { get; set;}
        public int endASCIINumbers { get; set;}
        public int startASCIILetters { get; set;}
        public int endASCIILetters { get; set;}
    }
}
