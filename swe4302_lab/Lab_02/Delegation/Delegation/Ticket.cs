﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Delegation
{
    public interface Ticket {

        bool bookTicket(Passenger passenger);
    }
}
