def waitingTime(processes, n,btime,wtime,quantum):
    rem_btime = [0] * n

    ctime = 0

    while(1):
        done = True

        for i in range(n):
            if(rem_btime[i]>0):
                done = False
                if(rem_btime[i] > quantum):
                    ctime+=quantum
                    rem_btime[i] -= quantum
                else:
                    ctime=ctime+rem_btime[i]
                    rem_btime[i]=0
        if(done == True):
            break