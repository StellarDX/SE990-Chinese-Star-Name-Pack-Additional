// Object * psi Vel A  ---  High Proper Motion Star  ---  OID=@3003378   (@@63067,12)  ---  coobox=20502 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Remove "PSI Vel A"{ParentBody "PSI Vel"}
Remove "PSI Vel B"{ParentBody "PSI Vel"}
Star "PSI Vel A/GJ 351 A/Gaia DR3 5426587107145955712/CCDM J09307-4028A/CD-39 5580A/CPD-39 3651A/CSI-39 5580 22/IDS 09268-4002 A/WDS J09307-4028A/Renson 23440/** COP 1A/HD 82434A/TYC 7696-2620-1/Gaia DR2 5426587107145955712"
{
	DateUpdated     "2024-07-26"
	ParentBody      "HIP 46651"
	Class           "F0IV"
	AbsMagn         2.56
	MassSol         1.44
	RadSol          2.216
	LumBol          9.661
	Teff            7122
	FeH             0.0
	Age             0.889

	BinaryOrbit     
	{
		Period          33.95
		Separation      16.2182436689986 // 0.862 asec
		Eccentricity    0.433
		Inclination     58.0
		AscendingNode   291.0
		Epoch           2440470.389931059908122
		ArgOfPericenter 224.3
		MeanAnomaly     0
	}
}

// Object * psi Vel B  ---  High Proper Motion Star  ---  OID=@3003379   (@@63067,13)  ---  coobox=20502 
// Object types: High Proper Motion Star,Double or Multiple Star,Variable Star,Star 
Star "PSI Vel B/GJ 351 B/Gaia DR3 5426587107149861120/CCDM J09307-4028B/CD-39 5580B/CPD-39 3651B/CSI-39 5580 23/IDS 09268-4002 B/WDS J09307-4028B/** COP 1B/HD 82434B/TYC 7696-2620-2/CSV 6723/NSV 4513/Gaia DR2 5426587107149861120"
{
	DateUpdated     "2024-07-26"
	ParentBody      "HIP 46651"
	Parallax        54.3053
	AppMagn         5.12
	Class           "F3IV"
	AbsMagn         3.79 // 计算的值
}
