// Object * ome Dra  ---  Spectroscopic Binary  ---  OID=@327524   (@@8344,0)  ---  coobox=1537 
// Object types: Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "OME Dra A" {ParentBody "OME Dra"}
Remove "OME Dra B" {ParentBody "OME Dra"}
Star "OME Dra A"
{
	DateUpdated     "2024-04-28"
	ParentBody      "GJ 4017"
	Class           "F4V"
	AbsMagn         2.95
	MassSol         1.46
	Radius          1299361.16210454 // 计算的值
	LumBol          5.61
	Teff            6500
	FeH             0.18
	Age             1.9

	BinaryOrbit
	{
		PeriodDays      5.2797766
		Separation      0.0983547240481836 // 3.469 mas
		Eccentricity    0.00220
		Inclination     151.4
		AscendingNode   1.23
		Epoch           2454349.083
		ArgOfPericenter 134.8
		MeanAnomaly     0
	}
}

Star "OME Dra B"
{
	ParentBody      "GJ 4017"
	Class           ""
	MassSol         1.18
	Teff            5900
	FeH             0
}

// Object * 20 Dra A  ---  Star  ---  OID=@14896634   (@@-1,255)  ---  coobox=1209 
// Object types: Double or Multiple Star,Star 
Star "20 Dra A"
{
	DateUpdated     "2024-04-28"
	ParentBody      "20 Dra"
	Parallax        14.9218
	AppMagn         7.03
	Class           "F2.2V"
	AbsMagn         2.9 // 计算的值

	BinaryOrbit
	{
		Separation      17.0108895413838 // 1.14 asec
	}
}

// Object * 20 Dra B  ---  High Proper Motion Star  ---  OID=@11464264   (@@-1,255)  ---  coobox=1209 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "20 Dra B"
{
	DateUpdated     "2024-04-28"
	ParentBody      "20 Dra"
	Parallax        14.9677
	AppMagn         7.25 /// Stellarium
	Class           "K8.7?"
	AbsMagn         3.12 // 计算的值
}